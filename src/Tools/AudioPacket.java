package Tools;

import AudioRecPlay.SenderThread;

/**
 * An audio packet (array of bytes)
 * The only reason this is declared as an object is to add some extra properties
 * along with the block rather than on its own.
 * @author Diego Viteri
 */
public class AudioPacket {
    public static final int META_SIZE = 2;
    public static final int DATA_SIZE = 512;
    public static final int SIZE = 514;
    private int packetID;
    private int blockID;
    private byte[] data;
    private static int i=0;
    private static int j=1;
    public AudioPacket(byte[] block){
        this.packetID = i;
        this.data = block;
        this.blockID = j;
        if(i == SenderThread.BLOCK_SIZE-1) {
            j++;
            i=0;
        }
        else{
            i++;
        }

    }
    public byte[] getData(){
        return data;
    }

    public int getPacketID(){
        return packetID;
    }
    public void setPacketID(int id){
        this.packetID = id;
    }
    public byte[] getBytes(){
        byte[] bytes = new byte[SIZE];
        bytes[0] = (byte) packetID;
        bytes[1] = (byte) blockID;
        System.arraycopy(this.data, 0, bytes, META_SIZE, this.data.length);
        return bytes;
    }
}

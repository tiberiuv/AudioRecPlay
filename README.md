# VoIP Communication System in Java

### DATE & TIME OF SUBMISSION: Demo - Friday 24th February
### ASSIGNMENT VALUE: 30%

#### Description:
The aim of this assignment is to design, implement and evaluate a VoIP communication system to operate between twoPCs.
**The design should follow a suitable structure:**
![Alt text](https://s30.postimg.org/bove8vdrl/Capture.png)

The VoIP layer will need to be developed for the sending machine and the receiving machine.

**Sender:**

The sender will need to take audio blocks from the audio layer and pass them down into the transport layer.

**Receiver:**

On the receiving side the VoIP layer will receive packets from the transport layer and will need to pass
them to the audio layer ready for playback. 
**This can be achieved by combining the work in Labs 1, 2, and 3.**

Three classes simulating non-ideal channel conditions are provided:
- DatagramSocket2
- DatagramSocket3
- DatagramSocket4

**TODO:**

1. Analysis of characteristics of the channels (Sending packets across the network and monitoring what is received)

2. Design systems for each channel

**ASSESSMENT:**

1. Quality of service under no packet loss - DatagramSocket(15%)
2. Quality of service with DatagramSocket2(15%)
3. Quality of service with DatagramSocket3 (10%)
4. Quality of service with DatagramSocket4 (10%)

**DataGram properties:**
    1. No loss or different order arrival of packets
    2. Packet-loss mainly 1-2 but sometimes 3-4+
    3. Rare packet-loss but highly disordered packets
    4. Some sort of coruption in the packets 

package org.itxtech.nemisys.raknet.protocol.packet;

import org.itxtech.nemisys.raknet.protocol.DataPacket;
import org.itxtech.nemisys.raknet.protocol.Packet;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class DATA_PACKET_4 extends DataPacket {
    public static final byte ID = (byte) 0x84;

    @Override
    public byte getID() {
        return ID;
    }

    public static final class Factory implements Packet.PacketFactory {

        @Override
        public Packet create() {
            return new DATA_PACKET_4();
        }

    }

}

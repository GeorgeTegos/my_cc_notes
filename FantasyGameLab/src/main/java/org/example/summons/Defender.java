package org.example.summons;

import org.example.IDefend;

public class Defender implements IDefend {
        private int power;
        public Defender() {
            this.power = 20;
        }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int defend(Defender defender) {
        return defender.getPower();
    }
}

package bai3;
    public class FAN {
        private static final int SLOW = 1;
        private static final int MEDIUM = 2;
        private static final int FAST = 3;

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public FAN() {
            this.speed = SLOW;
            this.on = false;
            this.radius = 5;
            this.color = "blue";
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            if (speed < SLOW || speed > FAST) {
                throw new IllegalArgumentException("Speed must be between 1 and 3");
            }
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            if (on) {
                return "Fan is on: speed=" + speed + ", color=" + color + ", radius=" + radius;
            } else {
                return "Fan is off: color=" + color + ", radius=" + radius;
            }
        }
    }

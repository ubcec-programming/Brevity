public class PositionPair {

    private double latitude, longitude;

        /**
         * Create a new Location given a latitude and longitude pair
         *
         * @param latitude not null, between -100 and 100
         * @param longitude not null, between -100 and 100
         */
        public PositionPair(double latitude, double longitude) {
            if (latitude <=100 && latitude >= -100 && longitude <=100 && longitude >= -100){
                this.latitude = latitude;
                this.longitude = longitude;
        }
    }

    public double getLatitude() { return latitude; }

    public double getLongitude() { return longitude; }

}

public class PositionPair extends geoMap {

    private double latitude, longitude;

        /**
         * Create a new Location given a latitude and longitude pair
         *
         * @param latitude not null
         * @param longitude not null
         */
        public PositionPair(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

    }



}

using System.Collections.Generic;
using Android.Gms.Maps.Model;

namespace GeoFencngDemo
{
    public static class Constants
    {
        public const string PACKAGE_NAME = "com.xamarin.geofencing";
        public const string SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";
        public const string GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

        public const long GEOFENCE_EXPIRATION_IN_HOURS = 12;
        public const long GEOFENCE_EXPIRATION_IN_MILLISECONDS = GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
        public const float GEOFENCE_RADIUS_IN_METERS = 200;

        public static readonly Dictionary<string, LatLng> BAY_AREA_LANDMARKS = new Dictionary<string, LatLng> {
            { "vital", new LatLng (16.5030341, 80.6931213) },
            { "Secundrabad", new LatLng (17.4399295, 78.49822741) },
            {"Banglore",new LatLng (12.9715987, 77.5945627)},
            {"My home",new LatLng (17.439843, 78.386821)}
        };
	}
}



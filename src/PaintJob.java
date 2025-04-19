public class PaintJob {
    /*
     getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.

The second parameter should be named height of type double. This parameter represents the height of the wall.

The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.

The fourth parameter should be named extraBuckets
     */

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double numbuckets = (double) ( (width * height) / areaPerBucket);

        return (int) Math.ceil(numbuckets - extraBuckets);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount( width,  height,  areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        /* getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).*/
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }


}

package CorePrograms.JavaProgrammingElement.level1;

class VolumeEarth{
    public static void main(String[]args){
        double radius=6378;
        double VolumeKm=((double) 4 /3) *3.14*Math.pow(radius,3);
        double VolumeMiles=VolumeKm/Math.pow(1.6,3);
    }
}

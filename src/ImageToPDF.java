public class ImageToPDF implements PDF{
    private PNGtoPDF pngConvert;
    private JPGtoPDF jpgConvert;
    public ImageToPDF(){
        this.pngConvert = new PNGtoPDF();
        this.jpgConvert = new JPGtoPDF();
    }

    @Override
    public void convertToPDF(String inputFileName, String outputFileName){
        if (inputFileName.endsWith(".png")){
            pngConvert.convertPNGtoPDF(inputFileName, outputFileName);
        } else if (inputFileName.endsWith(".jpg")) {
            jpgConvert.convertJPGtoPDF(inputFileName, outputFileName);
        } else {
            System.out.println("Unsopported file format:" + inputFileName);
        }
    }
}

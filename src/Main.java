public class Main {
    public static void main(String[] args) {
        PDF pdfConvert = new ImageToPDF();
        pdfConvert.convertToPDF("input1.png", "output1.pdf");
        pdfConvert.convertToPDF("input2.jpg","output2.pdf");
        pdfConvert.convertToPDF("input3.txt", "output3.pdf");

    }
}
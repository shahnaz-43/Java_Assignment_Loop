/*7. Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3*/

package string_manipulation;

public class ImgCount {
    public static void main(String[] args) {

        String[] mixedF = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int imgCount = 0;

        for (int i = 0; i < mixedF.length; i++) {
            if (mixedF[i].contains(".jpg") || mixedF[i].contains(".png")) {
                imgCount = imgCount + 1;
            }

        }
        System.out.println("Total image is : "+imgCount);
    }
}





package en.caps.hackerrank.algo;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		int[] h = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};		
		System.out.println(designerPdfViewer(h,"abc"));
		int[] h2 = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};		
		System.out.println(designerPdfViewer(h2,"zaba"));
	}

	static int designerPdfViewer(int[] h, String word) {
		
		int hMax = 0;
		
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			int asciiDiff = (int)c-'a';
			int height = h[asciiDiff];
			if(hMax<height)
				hMax=height;
		}
		int rec = hMax* word.length();
		return rec;
	}
}

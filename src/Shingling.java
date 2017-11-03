import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Shingling {
	/* A class Shingling that constructs k–shingles of a given length k (e.g., 10)
	 *  from a given document,
	 *  computes a hash value for each unique shingle, and represents
	 *   the document in the form of an ordered set of its hashed k-shingles.
	 * 
	 */
//I have a doubt if the class should an hexadecimal buffer as is it now or a byte objects
//Althoug that is super easy to adapt	
	public static ArrayList<ArrayList<StringBuffer>> create( String[] a, int k ) throws NoSuchAlgorithmException{

		ArrayList<ArrayList<StringBuffer>> group = new ArrayList<ArrayList<StringBuffer>>();
		for(int u=0;u<a.length;u++){
			a[u] = a[u].replaceAll("[^a-zA-z0-9\\s]*", "");
			ArrayList<StringBuffer> e = new ArrayList<StringBuffer>();
			for(int p=0;p<a[u].length()-k+1;p++){

				 MessageDigest md = MessageDigest.getInstance("SHA-256");
			        md.update(a[u].substring(p, p+2).getBytes());
			       byte byteData[] = md.digest();
			        //convert the byte to hex format method 1
			        StringBuffer sb = new StringBuffer();
			        for (int i = 0; i < byteData.length; i++) {
			         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			        }
				e.add(sb);
			}
			group.add(e);

		}

	return (group);
	}

	

}

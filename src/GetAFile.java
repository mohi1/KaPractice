
public class GetAFile {

	public static void main(String[] args) {

	}
	public static void getAFile(String fileName){
		
		File InputStream file = new FileInputStream(fileName);
		
	}
	catch(FileNotFoundException e){
		System.out.println("Sorry cant find that file");
	}
	
	catch(IOException e)
	{
		System.out.println("Unknown IO Error");
	}
	catch(Exception e)
	{
		System.out.println("Some error occurred");
	}
	finally{
		
	}

}

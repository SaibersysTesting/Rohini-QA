
public class MyArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] input1= {(float) 2.1,(float) 3.3,(float) 3.3,(float) 4.5,(float) 5.2,(float) 5.2,(float) 5.3,(float) 0.6};
		//int[] input1={2,3,3,4,5,5,5,6,7,7,9,9, -567890,(int) -5.8,10};
		float[] output= whatAmIdoing(input1);
		
		for(int p=0; p< output.length; p++){
			System.out.println(output[p]);
		}
	}

	public static float[] whatAmIdoing(float[] input1){
        
        int j = 0;
        int i = 1;
        
        if(input1.length < 2){
            return input1;
        }
        while(i < input1.length){
            if(input1[i] == input1[j]){
                i++;
            }else{
                input1[++j] = input1[i++];
            }   
        }
        float[] output = new float[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input1[k];
        }
         
        return output;
    }

}

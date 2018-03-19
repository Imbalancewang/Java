public class FindMaxMin{
	public int[] Find(int[] arr){
		int[] res=new int[2];
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		res[0]=min;res[1]=max;
		return res;
	}
	public static void main(String[] args){
		FindMaxMin fmm=new FindMaxMin();
		int[] test1={1,2,34};
		//fmm.Find(test1);
		for(int i=0;i<test1.length;i++){
			System.out.println(test1[i]+" ");
		}
		System.out.println(test1.length);
		int[] result=fmm.Find(test1);
		for(int j=0;j<2;j++){
			System.out.print(result[j]+" ");
		}
	}
}
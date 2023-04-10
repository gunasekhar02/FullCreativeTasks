
public class MostFreEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,2,3,2,3,4,5,3};
		int maxcount=0;
		int ele=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count+=1;
					}
			}
			if(count>maxcount) {
				maxcount=count;
				ele=a[i];
			}
		}
		System.out.println(ele+" Occured most frequently of "+(maxcount+1)+"times");

	}

}

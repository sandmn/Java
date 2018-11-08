public class Array{
	// public static void main(String[] args){
		// //1 数组是引用数据类型，需要进行动态内存开辟
		// //2.数组内存开辟之后，内容为各类型的默认值
		// //3.动态获取数组长度：length
		// //4.数组定义时可以：1. 声明时即开辟空间
		// //				  2. 先进行声明，在开辟空间，分布进行
		// //5. 基本类型无法使用类中的方法，需要将基本类型转化为对应的包装类即可使用
		// //6. 基本类型所占用的字节大小可以通过方法SIZE计算
		
		// // //int类型的默认值为0
		// // int[] a = new int[5];
		// // for(int i = 0;i < a.length;i++){
			// // System.out.println(a[i]);
		// // }
		// // //double类型,默认值为0.0
		// // double[] d = new double[3];
		// // for(int i = 0;i < d.length;i++){
			// // System.out.print(d[i] + " ");
		// // }
		// // System.out.println();
		// // //String类型，默认值为null
		// //String[] str = null;
		// // str = new String[5];
		// // for(int i = 0;i < str.length;i++){
			// // System.out.print(str[i] + " ");
		// // }
		// //System.out.println();
		// //boolean类型，默认值为false
		// //boolean[] b = null;
		// // b = new boolean[5];
		// // for(int i = 0;i < b.length;i++){
			// // System.out.print(b[i] + " ");
		// // }
	    // //System.out.println();
		// //基本类型无法使用类中的方法，需要将基本类型转化为对应的包装类即可使用
		// // int a = 10;
		// // Integer a1 = new Integer(a);
		// // System.out.println(a1.SIZE/8);
	// }
	
	
	// public static void main(String[] args){
		// //1. 引用类型类似C++中的指针类型，本身存放在栈区，指向动态开辟的堆区内存；
		// //   引用类型可以进行传递，即同一片堆区内存可由不同的引用类型变量指向；
	
		// int[] a = null;
		// a = new int[5];
		// int[] a_temp = null;
		// a_temp = a;
		// for(int i = 0;i < a.length;i++){
			// a[i] = i;
		// }
		// for(int i = 0;i < a_temp.length;i++){
			// System.out.print(a_temp[i] + " ");
		// }
		// System.out.println();
	// }
	
	
	// public static void main(String[] args){
		// //静态初始化数组
		// //完整模式
		// int[] a = new int[]{1,2,3,4};
		// //简化模式
		// int[] a1 = {1,2,3,4};
		// for(int i = 0;i < a.length;i++){
			// System.out.print(a[i] + " ");
		// }
		// System.out.println();
		// for(int i = 0;i < a1.length;i++){
			// System.out.print(a1[i] + " ");
		// }
		// System.out.println();
	// }
	
	// //二维数组
	// public static void main(String[] args){
		// //动态初始化二维数组
		// int[][] a = new int[2][3];
		// for(int i = 0;i < a.length;i++){
			// for(int j = 0;j < a[i].length;j++){
				// a[i][j] = i;
			// }
		// }
		// //静态初始化二维数组
		// int[][] b = new int[][]{
			// {1,2,3},
				// {2,3,4}
		// };
		// for(int i = 0;i < a.length;i++){
			// for(int j = 0;j < a[i].length;j++){
				// System.out.print(a[i][j] + " ");
			// }
		// }
		// System.out.println();
	// }
	
	// //在方法中对数组进行操作
	// public static void main(String[] args){
		// int[] a = init();
		// bigger(a);
		// printarray(a);
	// }
	// //初始化数组
	// public static int[] init(){
		// return new int[]{1,2,3,4,5};
	// }
	// //扩大数组
	// public static void bigger(int[] temp){
		// for(int i = 0;i < temp.length;i++){
			// temp[i] = temp[i]*5;
		// }
	// }
	// //打印数组
	// public static void printarray(int[] temp){
		// for(int i = 0;i < temp.length;i++){
			// System.out.print(temp[i] + " ");
		// }
		// System.out.println();
	// }
	
	
	// //数组不同类型实现排序
	// public static void main(String[] args){
		// int[] a = new int[]{10,9,24,3,24,435};
		// char[] b = new char[]{'s','d','e','A'};
		// java.util.Arrays.sort(a);
		// java.util.Arrays.sort(b);
		// printint(a);
		// printchar(b);
	// }
	// //打印整型数组
	// public static void printint(int[] a){
		// for(int i = 0;i < a.length;i++){
			// System.out.print(a[i] + " ");
		// }
		// System.out.println();
	// }
	// //重载：打印char型数组
	// public static void printchar(char[] c){
		// for(int i = 0;i < c.length;i++){
			// System.out.print(c[i] + " ");
		// }
		// System.out.println();
	// }
	
	
	// //数组拷贝1：System.arraycopy(源数组，源数组起始点，目标数组，目标数组起始点，拷贝的数组元素长度)
	// //原数组和目标数组均以存在
	// //数组拷贝2：java,util.Arrays.copyOf(原数组名，新数组长度)
	// public static void main(String[] args){
		// int[] src = new int[]{1,2,3,4,5,6,7,8};
		// int[] dest = new int[]{11,22,33,44,55,66,77,88};
		// System.arraycopy(src,1,dest,2,3);
		// printint(dest);
		// printint(src);
		// int[] dest1 = java.util.Arrays.copyOf(src,5);
		// int[] dest2 = java.util.Arrays.copyOf(src,10);
		// dest = java.util.Arrays.copyOf(src,10);
		// printint(dest1);
		// printint(dest2);
		// printint(dest);
	// }
	// public static void printint(int[] a){
		// for(int i : a){
			// System.out.print(i + " ");
		// }
	
		// System.out.println();
	// }
	
	//计算数组中的最大值，最小值，和，平均值，数组拼接，数组截取
	public static void main(String[] args){
		int[] a = new int[]{23,41,4,23,14,54,56,34};
		int[] b = new int[]{23,54,5};
		int max = arrayMaxElement(a);
		int min = arrayMinElement(a);
		int sum = arrayElementSum(a);
		int[] join = arrayJoin(a,b);
		int[] sub = arraySub(a,2,5);
		System.out.println("max is " + max);
		System.out.println("min is " + min);
		System.out.println("sum is " + sum);
		printint(join);
		printint(sub);
	}
	public static void printint(int[] a){
		for(int i : a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	//计算数组的最大值
	public static int arrayMaxElement(int[] a){
		//如果数组为空，则参数异常
		if(a == null){
			throw new IllegalArgumentException("array must not null");
		}
		int max = Integer.MIN_VALUE;
		for(int temp : a){
			if(temp > max){
				max = temp;
			}
		}
		return max;
	}
	//计算数组的最小值
	public static int arrayMinElement(int[] a){
		if(a == null){
			throw new IllegalArgumentException("array must not null");
		}
		int min = Integer.MAX_VALUE;
		for(int temp : a){
			if(temp < min){
				min = temp;
			}
		}
		return min;
	}
	//计算总和
	public static int arrayElementSum(int[] a){
		if(a == null){
			throw new IllegalArgumentException("array must not null");
		}
		int sum = 0;
		for(int temp : a){
			sum += temp;
		}
		return sum;
	}
	//数组拼接
	public static int[] arrayJoin(int[] a,int[] b){
		if(a == null || b == null){
			throw new IllegalArgumentException("array must not null");
		}
		int[] temp = new int[a.length + b.length];
		for(int i = 0;i < a.length;i++){
			temp[i] = a[i];
		}
		for(int i = 0;i < b.length;i++){
			temp[a.length + i] = b[i];
		}
		return temp;
	}
	//数组截取
	public static int[] arraySub(int[] a,int start,int end){
		if(a == null){
			throw new IllegalArgumentException("array must not null");
		}
		if(start < 0 || end < 0){
			throw new ArrayIndexOutOfBoundsException("index of array must > 0");
		}
		if(start > a.length || end > a.length){
			throw new ArrayIndexOutOfBoundsException("index of array must < length of array");
		}
		if(start > end){
			throw new IllegalArgumentException("start must < end");
		}
		int len = end - start;
		int[] temp = new int[len];
		for(int i = 0;i < len;i++){
			temp[i] = a[start + i];
		}
		return temp;
	}
}



		

public class ArrayRotation  
{   
public static void rotateRight(int array[], int d, int n)   
{   
for (int i = 0; i < d; i++)   
rotateArrayByOne(array, n);      
}    
public static void rotateArrayByOne(int array[], int n)   
{   
int i, temp;     
temp = array[n - 1];   
for (i = n-1; i > 0; i--)   
array[i] = array[i - 1];       
array[0] = temp;   
}   
public static void main(String args[])   
{    
int array[] = { 1, 2, 3, 4, 5, 6,7};   
int r = 3;  
int n = array.length;  
System.out.println("Array before rotation: ");   
for(int i = 0 ; i < n ; i++)  
{    
System.out.print(array[i]+ " ");   
}  
System.out.println();  
rotateRight(array, r, n);   
System.out.println("\nArray after right rotation: ");   
for(int i = 0 ; i < n ; i++)  
{        
System.out.print(array[i] + " ");  
}   
}   
}  
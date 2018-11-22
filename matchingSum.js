// Problem: Given an sorted array and a number, find if the array contains two elements who's sum is equal to the number given.

// EX1: Arr1 = [1,2,3.5,3.5,5], 5)
// 	    Ans: false
// EX2: Arr1 = [1,2,3,3.5,5], 5)
// 	    Ans: true



function matchingSum(arr, num){
    var start=0;
    var end=arr.length-1;
    while(start<end){
	     if(arr[start]+arr[end]===num){
	         return true
	     }else if(arr[start]+arr[end]>num){
	         end--
	     }else{
	         start++
	     }
    }
    return false
}


// Comment:
// Time Complexity : O(n)
// Space Complexity: O(n)
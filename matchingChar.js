// Problem: Given two arrays, find if they have any similar charecters. If they have then return true.

// EX1: Arr1 = ['a','b','z','i']
// 	 Arr2 = ['q','c']
// 	 Ans: false
// EX2: Arr1 = ['a','b','z','i']
// 	 Arr2 = ['q','c', 'a']
// 	 Ans: true



function matchingChar(arr1, arr2){
    var obj = {}
    for(let char of arr1){
        obj[char] == ++obj[char] || 1
    }

    for(let char of arr2){
        if(obj.hasOwnProperty(char)) return true
    }
    return false
}


// Comment:
// Time Complexity : O(n)
// Space Complexity: O(n)
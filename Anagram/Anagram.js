function sortString(c){
    var arr = c.split('');
    var temp;

    for(var i=0; i<arr.length;i++){
        for(var j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr.join('');
}

function checkWord(a,b){
    let n1 = a.length;
    let n2 = b.length;

    if(n1 != n2){
        console.log("not valid");
        return 
    }

    let str1 = sortString(a);
    let str2 = sortString(b);

    if(str1 == str2){
        console.log("True");
    }
    else{
        console.log("False");
    }
}

console.log("learn","earn: ")
checkWord("learn","earn");
console.log("come","some: ")
checkWord("come","some");
console.log("save","vase: ")
checkWord("save","vase");
console.log("night","thing: ")
checkWord("night","thing");
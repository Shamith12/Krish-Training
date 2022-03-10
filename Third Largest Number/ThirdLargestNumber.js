
let arry = [22,11,44,21,91,78]
let n = arry.length;
thirdLargest(arry,n);

function thirdLargest(array,n){
    let i=0,largest=0,slargest=0,tlargest=0;

    if(arry< 3){
        console.log("Invalid Input");
    }

    for(i=0;i<array.length;i++){
        if(largest<array[i] ){
            tlargest = slargest;
            slargest=largest;
            largest=array[i]; 
        }
        else if(slargest<array[i] && array[i]!=largest){   
        slargest=array[i];
        }
        else if(tlargest<array[i] && array[i]!=slargest && array[i]!=largest)
        {
            tlargest=array[i];
        }
    }
    console.log("Sequence:" + array);
    console.log("Third Largest Number:" + tlargest);
}

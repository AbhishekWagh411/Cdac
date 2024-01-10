
function getCheese(){
 return new Promise((resolve, reject)=>{
        setTimeout(
            ()=>{
                const cheese = "🧀";
                resolve(cheese); 
            },2000
        );
    })
}

function getDough(cheese){
    return new Promise((resolve, reject)=>{
           setTimeout(
               ()=>{
                   const dough = cheese+"🫓";
                   reject("dough"); 
               },2000
           );
       })
   }

function bakePizza(dough){
return new Promise((resolve, reject)=>{
        setTimeout(
            ()=>{
                const pizza = dough+"🍕";
                resolve(pizza); 
            },2000
        );
    })
}
getCheese().then((cheese)=>{
    console.log("got the ",cheese);return getDough(cheese)}).
    then((dough)=>{ console.log("got the ",dough); return bakePizza(dough)}).
    then((pizza)=>{
        console.log(pizza,"is baked");
    }).catch((err)=>{console.log("failure in creating ",err);});
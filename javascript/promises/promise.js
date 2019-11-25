const promise = new Promise(function(resolve,reject){

    if(5>10){
        resolve("success")
    }else{
        reject("error")
    }
})

promise.then(function(data){
    console.log("Data ",data);    
}).catch(function(error){
    console.log("error ",error);
})


const personData = new Promise(function(resolve,reject){
    if(20>10){
        let data = [10,20,40,50]
        resolve(data)
    } else{
        reject("no data")
    }
})

personData.then(function(pdata){
    console.log("data ",pdata);
    pdata = pdata.push(245,340)
    return pdata    
}).then(function(planetdata){
    console.log("planetdata ",planetdata);
    
}).catch(function(error){
    console.log("error",error);
    
})
// var brands = ["Kinley","bisleri","aquafina","kingfisher"];
//     brands.forEach(function(brand,index){
//         console.log(brand,index);
//     });

//     var hobbies = ["Riding","Reading","Numismatics","Trekking"]
//     var a = hobbies.push("Music")
//     console.log("After Push ",hobbies)
    
//     var d = hobbies.pop()
//     console.log("element ",d)
//     console.log("After Pop" ,hobbies)

//     var c =hobbies.shift()
//     console.log("element ",c)
//     console.log("After Shift",hobbies)

//     var b =hobbies.unshift("Dancing")
//     console.log("element ",b)
//     console.log("After unshift",hobbies)

//    var b = hobbies.indexOf("Numismatics")
//     if(b>-1){
//             console.log("element present in b ",b-1 )
//     } else{
//         cconsole.log("After Indexof ",hobbies)
//     }


//     var a=["Hero","Honda"]
//     var b=a.join("------")
//     console.log(b)


//     var a = hobbies.splice(1,2,"Singing","sleeping","eating")
//     console.log("removed ",a)
//     console.log("After splice",hobbies)

//     var news = hobbies.slice(0,2)
//     console.log("New Elements ",news)
//     console.log("After slice ",hobbies)

//     var num = [100,6978,9632315219];
//     var filternum = num.filter(num => num > 100)
// console.log("Filtered Num ",filternum)

    // var numb = [7294,6978,9284];
    // var fnum = numb.map(value => value+50)
    //     console.log("mapped using arrow numbers ",fnum)


    // var items = [{
    //     name : "Shoes",
    //     id : 1,
    //     price : 1500,
    // },
    // {
    //     name : "watch",
    //     id : 2,
    //     price : 2000,
    // },
    // {
    //     name : "shirt",
    //     id : 3,
    //     price : 599,
    // },
    // {
    //     name : "mobile",
    //     id : 4,
    //     price : 25999
    // }]

    // var filtereditems = items.filter(item => item.price>1500)
    // console.log("FILTERED ITEMS",filtereditems)

    // // var priceadd = items.map(item => {
    // //     item.price+=500
    // //     return item
    // // })
    // var mapfile=items.map(item => {
    //     var i ={
    //         name : item.name,
    //         price : item.price + 100,
    //         id : item.id
    //     }
    //     return i
    // })
    // console.log(items)

    var chocolates = ["dairymilk","kitkat","fivestar"]
    var haskaccha = chocolates.includes("kachha mango bite");
    console.log("has kaccha ",haskaccha)
    console.log("***********************************")

    var isArraychoc = Array.isArray(chocolates);
    console.log("chocolates is array = ",isArraychoc)

    console.log("***********************************")
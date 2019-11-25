var date= new Date()
console.log("Today Date ",date)

// var date1=new Date(0)
// console.log("Date millisecond constructor",date1)

// var date2=new Date("October 30")
// console.log("Date String Constructor",date2)

// var date3=new Date(1990,4,12)
// console.log("Date Years Month Constructor ",date3)


var year=date.getFullYear();
console.log("year",year)

var minutes=date.getMinutes();
console.log("minutes",minutes)

var Month=date.getMonth();
console.log("months",Month)

var day=date.getDay();
console.log("day",day)

var tdydate=date.getDate();
console.log("tdydate",tdydate)

var months=['jan','feb','mar','april','may','jun','july','aug','sep','oct','nov','dec']
var thismonth=months[Month]

var days=['sun','mon','tue','wed','thur','fri','sat']
var thisday=days[day]

console.log("-------------------------")
console.log("month= ",thismonth)
console.log("day= ",thisday)
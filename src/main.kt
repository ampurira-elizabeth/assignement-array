fun main(){
    var names= arrayOf("liz", "beth" ,"jane" ,"cyne")
    println(names.contentToString())
    cities()
    figures()
    var name=sentence("liz","beth","elizabeth")
    println(name.contentToString())



    }
fun cities(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities=cities.sortedArray()
    cities.forEach { cities ->
        println(cities.capitalize())
        }

    }
fun figures(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var num1= arrayOf(numbers[1],numbers[4])
   println(num1.sum())
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun sentence(name1:String,name2:String,name3:String):Array<String>{
    var name= arrayOf(name1,name2,name3)
    return name

    }


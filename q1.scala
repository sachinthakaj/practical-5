
case class book(title:String,author:String,isbn:String)
val book1=book("Anna","Sheksphere","b345")
val book2=book("Robinson","Will","b346")
val book3=book("Island","Jhone","b347")
val book4=book("Hearth","Will","b348")
val book5=book("Anna","Will","b325")
@main def q1(): Unit = {
  /*println("**************Question 1*****************\n")  
  println("Enter the product list:")
  val L1 = getProductList()
  println("-------------------------------------")
  printProductList(L1)
  println("-------------------------------------")
  getTotalProduct(L1)
  println("\n\n**************Question 2*****************\n") */ 
  
  /*println(createBookSet(book1,book2,book3,book4))
  val book5=book("Sound","Keil","b349")
  println("-----------------------------------------------------------------------------------\n")
  val bookSet=createBookSet(book1,book2,book3,book4)
  
  println(addNewBook(bookSet,book5))
  println("\n-----------------------------------------------------------------------------------\n")
  println(removeBook(bookSet,"b347"))
  println("\n-----------------------------------------------------------------------------------\n")
  searchBook(bookSet,"b358")
  println("\n-----------------------------------------------------------------------------------\n")
  displayLibrary()*/
  //val bookSet=createBookSet(book1,book2,book3,book4,book5)
  //searchForBook(bookSet,"Anna")
  //searchForBookByAuthor(bookSet,"Will")

  println("\n\n**************Question 3*****************\n")
  println("Enter Number:")
  var n:Int=scala.io.StdIn.readInt()
  var i=0
  var j=1
  Fiboncci(i,j,n)


}


def getProductList(): List[String] = {
  var productList = List[String]()
  var done = false

  while (!done) {
    val input = scala.io.StdIn.readLine()
    if (input == "done") {
      done = true
    } else {
      productList = productList :+ input
    }
  }
  productList
}

def printProductList(L: List[String]): Unit = {
  var i=0  
  for (i <- L.indices) {
    println(s"${i + 1} - ${L(i)}")
  }
}

def getTotalProduct(L:List[String]):Unit ={
    println("Total="+L.length)
}


def createBookSet(book1:book,book2:book,book3:book,book4:book,book5:book)={
    val bookSet=Set(book1,book2,book3,book4,book5)
    bookSet
}
def addNewBook(bookSet:Set[book],bookx:book)={
    val newBookSet=bookSet + bookx
    newBookSet
}

def removeBook(bookSet:Set[book],isbn1:String)={
    
    val foundBook=bookSet.find(_.isbn==isbn1)
    val updatedBookSet=bookSet -- foundBook 
    updatedBookSet
}

def searchBook(bookSet:Set[book],isbn1:String)={
    val foundBook=bookSet.find(_.isbn==isbn1)
    foundBook match{
        case Some(bookToFind)=>
            println("Already in the Set")

        case None => 
            println("Not in the Set")    
    }
}
def display(bookx:book)={
    println("Title-"+bookx.title)
    println("Author-"+bookx.author)
    println("Isbn-"+bookx.isbn +"\n")

}
def displayLibrary()={
    display(book1)
    display(book2)
    display(book3)
    display(book4)
    
}
def displaytitle(bookx:book)={
    println(bookx.title)

}

def searchForBook(bookSet:Set[book],title1:String)={
    val foundBooks=bookSet.filter(_.title==title1)
    if(foundBooks.nonEmpty){
        foundBooks.foreach(display)

    }
    else{
        println("Not in the set")
    }
}

def searchForBookByAuthor(bookSet:Set[book],author1:String)={
    val foundBooks=bookSet.filter(_.author==author1)
    if(foundBooks.nonEmpty){
        foundBooks.foreach(displaytitle)

    }
    else{
        println("Not in the set")
    }
}

def Fiboncci(i:Int,j:Int,n:Int):Unit=  {
    if(n > 0){
        print(s"$i ")
        Fiboncci(j,i+j,n-1)
    }

}


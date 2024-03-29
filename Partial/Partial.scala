import com.cra.figaro.algorithm.factored.VariableElimination
import com.cra.figaro.language.{Chain, Select}
import com.cra.figaro.library.atomic.discrete.FromRange
// Cerințe:
// 1. Să se modeleze aruncarea zarurilor de către un jucător.
// 2. Să se afiseze probabilitatea ca la o aruncare a zarurilor să căștige p1.
// 3. Să se afiseze probabilitatea ca la o aruncare a zarurilor să căștige p2. La acest punct si
// la precedentul se va utiliza algoritmul de inferență VariableElimination.
// 4. Comparați cele două probabilități și explicați rezultatul comparării. Răspunsul va fi dat
// sub formă de comentariu.
// 5. Să se scrie o funcție
// play(p1Wins: Element[Int], p2Wins: Element[Int], no: Int) :
// Element[Int]
// care modelează o tura de joc, unde variabila aleatoare p1Wins modelează numărul de
// ture câștigate deja de p1, p2Wins modelează numărul de ture câștigate deja de p2, no
// este numărul de ture rămase de jucat. Valarile returnate posibile sunt: 1 dacă p1 a
// câștigat, 2 dacă p2 a câștigat, 0 dacă e remiză. Se va utiliza elementul definit la 1. Se
// recomandă o descriere recursivă a acestei funcții.
// 6. Să se creeze un joc cu 10 ture și să se afișeze probabilitățile de câștig pentru fiecare
// câștigător. Aici se va utiliza un algoritm de inferență bazat pe eșantionare.
// 7. Interpretați rezultatele (se scrie sub formă de comentariu în fișier). Răspunsul va fi dat
// sub formă de comentariu.

object Partial {
  def main(args: Array[String]): Unit ={
    val roll=Chain(numberOfSides, ((i: Int) => FromRange(1, i+1)))
   
    //1


    //2
  val die1 = FromRange(1, 6)
  val die2 = FromRange(1, 6)
  val die3= FromRange(1, 6)
  val die4=FromRange(1, 6)
  val total = Apply(die1, die2, (i1: Int, i2: Int) => i1 + i2)
  val total2 = Apply(die3, die4, (i1: Int, i2: Int) => i1 + i2)
  total.addCondition((i: Int) => i >2)
  println(VariableElimination.probability(total, 7))
  println(VariableElimination.probability(total, 11))
  println(VariableElimination.probability(total2, 2))
   println(VariableElimination.probability(total2, 3))
    println(VariableElimination.probability(total2, 12))

 

  val Play = Apply(player1, player2 
      (total: Int, total2: Int) =>
        else if ( total==7 || total==11) //p1Wins
        else if( total2==2 || total2==3|| total2==12) //p2wins
        else //remiza
    
         )


  //3


  //4 

  //5 
 // play(p1Wins: Element[Int], p2Wins: Element[Int], no: Int) :Element[Int]
  //6 





    
  }
}
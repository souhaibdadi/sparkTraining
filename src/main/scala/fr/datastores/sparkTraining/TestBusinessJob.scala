package fr.datastores.sparkTraining

import org.apache.spark.sql.SparkSession

object TestBusinessJob extends SparkJob {


  override def execute()(implicit sc : SparkSession): Unit = {
    import sc.implicits._

    val data = Seq(("A","B")).toDF()

    data.show()





  }
}

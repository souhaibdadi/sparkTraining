package fr.datastores.sparkTraining
import org.apache.spark.sql.SparkSession


trait SparkJob {

  def main(args: Array[String]): Unit = {
    execute()(buildSparkSession)
  }

  def execute()(implicit sc : SparkSession) : Unit

  private def buildSparkSession(): SparkSession = {
    SparkSession.builder
      .master("local[*]")
      .appName("Datastore Job")
      .getOrCreate()
  }


}

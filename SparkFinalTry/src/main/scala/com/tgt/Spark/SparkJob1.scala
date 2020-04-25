package com.tgt.Spark

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SparkJob1 {
  
  def main(args: Array[String]){
    
    val conf = new SparkConf().setAppName("CombineByKey").setMaster("local")
     val sc = new SparkContext(conf)
   
     val r1  = sc.range(1,10)
     r1.collect().foreach(println)
     
     println("Location of SPARK_HOME : " + sys.env.get("SPARK_HOME"))
     println("Location of SCALA HOME : " + sys.env.get("SCALA_HOME"))
     
     sc.stop()
     
  }
}
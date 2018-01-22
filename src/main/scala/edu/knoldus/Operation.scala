package edu.knoldus

import org.apache.log4j.Logger

object Operation {

  def main(args: Array[String]): Unit = {
    val logger = Logger.getLogger(this.getClass)
    val totalCommission = new TotalCommission

    val clientSideCommissionElement1 = ClientSideCommission(2)
    val clientSideCommissionElement2 = ClientSideCommission(3)
    val clientSideList = List(clientSideCommissionElement1,clientSideCommissionElement2)
    logger.info(totalCommission.getTotalCommission(clientSideList))

    val streetSideCommissionElement1 = StreetSideCommission(5)
    val streetSideCommissionElement2 = StreetSideCommission(6)
    val streetSideList = List(streetSideCommissionElement1,streetSideCommissionElement2)
    logger.info("\n" + totalCommission.getTotalCommission(streetSideList))


  }

}

package pontinisystems.myearnings.features.share.publ.domain.erros

sealed class Failure:Exception(){
    open class Unknown(override val message:String?=""): Failure()
}
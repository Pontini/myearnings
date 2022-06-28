package pontinisystems.myearnings.features.share.publ.domain.error

sealed class Failure:Exception(){
    open class Unknown(override val message:String?=""): Failure()
}
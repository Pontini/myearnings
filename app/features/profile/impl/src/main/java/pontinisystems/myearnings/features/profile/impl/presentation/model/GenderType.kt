package pontinisystems.myearnings.features.profile.impl.presentation.model

enum class GenderType():EnumOptionType {

    MALE() {
        override fun description(): String {
            return "Masculino"

        }
    },
    FEMALE() {
        override fun description(): String {
           return "Feminino"
        }
    }
}

interface EnumOptionType {
    fun description(): String
}

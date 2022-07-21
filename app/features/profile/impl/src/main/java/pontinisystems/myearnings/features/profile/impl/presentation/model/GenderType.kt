package pontinisystems.myearnings.features.profile.impl.presentation.model

enum class GenderType() : EnumOptionType {

    MALE() {
        override fun getDescription(): String {
            return "Masculino"

        }

        override fun getCode(): String {
            return "F"
        }
    },
    FEMALE() {
        override fun getDescription(): String {
            return "Feminino"
        }

        override fun getCode(): String {
            return "M"
        }
    }
}

interface EnumOptionType {
    fun getDescription(): String
    fun getCode(): String
}

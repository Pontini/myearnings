package pontinisystems.myearnings.features.profile.publ.domain.usecases

import pontinisystems.core.Either
import pontinisystems.myearnings.features.profile.publ.domain.entities.Profile

interface ProfileIsRegistered {
    suspend operator fun invoke(): Either<Boolean,Exception>
}
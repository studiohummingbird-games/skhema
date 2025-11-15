/* ActionModule.kt
 * Copyright (C) 2025  Zymus
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package games.studiohummingbird.skhema.types.serializable.modules

import games.studiohummingbird.skhema.types.Action
import games.studiohummingbird.skhema.types.serializable.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

val ActionModule = SerializersModule {
    polymorphic(Action::class) {
        serializableAcceptAction()
        serializableAchieveAction()
        serializableAction()
        serializableActivateAction()
        serializableAgreeAction()
        serializableAllocateAction()
        serializableApplyAction()
        serializableArriveAction()
        serializableAskAction()
        serializableAssessAction()
        serializableAssignAction()
        serializableAuthorizeAction()
        serializableBefriendAction()
        serializableBookmarkAction()
        serializableCheckAction()
        serializableCheckInAction()
        serializableCheckOutAction()
        serializableChooseAction()
        serializableCommentAction()
        serializableCommunicateAction()
        serializableConfirmAction()
        serializableConsumeAction()
        serializableControlAction()
        serializableCookAction()
        serializableCreateAction()
        serializableDeactivateAction()
        serializableDepartAction()
        serializableDisagreeAction()
        serializableDiscoverAction()
        serializableDislikeAction()
        serializableDrawAction()
        serializableDrinkAction()
        serializableEatAction()
        serializableEndorseAction()
        serializableFilmAction()
        serializableFindAction()
        serializableFollowAction()
        serializableIgnoreAction()
        serializableInformAction()
        serializableInstallAction()
        serializableInteractAction()
        serializableInviteAction()
        serializableJoinAction()
        serializableLeaveAction()
        serializableLikeAction()
        serializableListenAction()
        serializableLoseAction()
        serializableMarryAction()
        serializableMoveAction()
        serializableOrganizeAction()
        serializablePaintAction()
        serializablePhotographAction()
        serializablePlayGameAction()
        serializableReactAction()
        serializableReadAction()
        serializableRegisterAction()
        serializableRejectAction()
        serializableReplyAction()
        serializableResumeAction()
        serializableReviewAction()
        serializableRsvpAction()
        serializableShareAction()
        serializableSubscribeAction()
        serializableSuspendAction()
        serializableTieAction()
        serializableTrackAction()
        serializableTravelAction()
        serializableUnRegisterAction()
        serializableUseAction()
        serializableViewAction()
        serializableVoteAction()
        serializableWantAction()
        serializableWatchAction()
        serializableWearAction()
        serializableWinAction()
        serializableWriteAction()
    }
}

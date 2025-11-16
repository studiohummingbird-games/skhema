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
        serializableAddAction()
        serializableAgreeAction()
        serializableAllocateAction()
        serializableAppendAction()
        serializableApplyAction()
        serializableArriveAction()
        serializableAskAction()
        serializableAssessAction()
        serializableAssignAction()
        serializableAuthorizeAction()
        serializableBefriendAction()
        serializableBookmarkAction()
        serializableBorrowAction()
        serializableBuyAction()
        serializableCancelAction()
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
        serializableDonateAction()
        serializableDownloadAction()
        serializableDrawAction()
        serializableDrinkAction()
        serializableEatAction()
        serializableEndorseAction()
        serializableExerciseAction()
        serializableFilmAction()
        serializableFindAction()
        serializableFollowAction()
        serializableGiveAction()
        serializableIgnoreAction()
        serializableInformAction()
        serializableInsertAction()
        serializableInstallAction()
        serializableInteractAction()
        serializableInviteAction()
        serializableJoinAction()
        serializableLeaveAction()
        serializableLendAction()
        serializableLikeAction()
        serializableListenAction()
        serializableLoseAction()
        serializableMarryAction()
        serializableMoneyTransfer()
        serializableMoveAction()
        serializableOrderAction()
        serializableOrganizeAction()
        serializablePaintAction()
        serializablePayAction()
        serializablePerformAction()
        serializablePhotographAction()
        serializablePlanAction()
        serializablePlayAction()
        serializablePlayGameAction()
        serializablePreOrderAction()
        serializableQuoteAction()
        serializableReactAction()
        serializableReadAction()
        serializableReceiveAction()
        serializableRegisterAction()
        serializableRejectAction()
        serializableRentAction()
        serializableReplyAction()
        serializableReserveAction()
        serializableResumeAction()
        serializableReturnAction()
        serializableReviewAction()
        serializableRsvpAction()
        serializableScheduleAction()
        serializableSearchAction()
        serializableSeekToAction()
        serializableSellAction()
        serializableSendAction()
        serializableShareAction()
        serializableSolveMathAction()
        serializableSubscribeAction()
        serializableSuspendAction()
        serializableTakeAction()
        serializableTieAction()
        serializableTipAction()
        serializableTrackAction()
        serializableTradeAction()
        serializableTransferAction()
        serializableTravelAction()
        serializableUnRegisterAction()
        serializableUpdateAction()
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

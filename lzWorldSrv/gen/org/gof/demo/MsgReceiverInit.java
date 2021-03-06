package org.gof.demo;
import org.gof.core.support.observer.ObServer;
import org.gof.core.support.function.*;
import org.gof.core.gen.GofGenFile;

@GofGenFile
public final class MsgReceiverInit{
	public static <K,P> void init(ObServer<K, P> ob){
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCompetitionBattleLog", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSCompetitionBattleLog, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCompetitionLeave", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSCompetitionLeave, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGetSeflRankPage", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSGetSeflRankPage, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCompetitionEnd", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSLayerEnd, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenRank", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSOpenRank, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRefreshCount", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSRefreshCount, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRefreshEnemy", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSRefreshEnemy, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSResetCDTime", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCSResetCDTime, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCompetitionEnter", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.competition.CompetitionMsgHandler.class))::onCompetitionEnter, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSChangeNameRandom", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.name.NameMsgHandler.class))::CSChangeNameRandom, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSChangeName", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.name.NameMsgHandler.class))::onCSChangeName, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenLivenessUI", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.dailyliveness.LivenessMsgHandler.class))::openLivenessUI, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRsvLivenessAwards", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.dailyliveness.LivenessMsgHandler.class))::rsvLivenessAwards, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSHumanInfo", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.human.HumanMsgHandler.class))::_result_onCSHumanInfo, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSChangeModel", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.human.HumanMsgHandler.class))::onCSChangeModel, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSFightAtk", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.FightMsgHandler.class))::onCSFightAtk, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSFightRevive", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.FightMsgHandler.class))::onCSFightRevive, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSkillAddGeneral", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.FightMsgHandler.class))::onCSSkillAddGeneral, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSkillInterrupt", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.FightMsgHandler.class))::onCSSkillInterrupt, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSkillRemoveGeneral", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.FightMsgHandler.class))::onCSSkillRemoveGeneral, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSEnterGeneralTask", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSEnterGeneralTask, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSFragInfo", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSFragInfo, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGenTaskFightTimes", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGenTaskFightTimes, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralEquipUp", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralEquipUp, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralExpAdd", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralExpAdd, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralInfo", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralInfo, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralInfoAttIng", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralInfoAttIng, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralList", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralList, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralQualityUp", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralQualityUp, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralRecruit", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralRecruit, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralStarUp", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralStarUp, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGeneralToAttIng", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSGeneralToAttIng, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOneFragInfo", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSOneFragInfo, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSellFrag", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.general.GeneralMsgHandler.class))::onCSSellFrag, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBuyMallGoods", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.MallMsgHandler.class))::onCSBuy, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenMall", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.MallMsgHandler.class))::onCSOpenMall, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSAddRelSkill", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSAddRelSkill, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSChangeInborn", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSChangeInborn, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSDelRelSkill", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSDelRelSkill, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInbornLevelup", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSInbornLevelup, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSkillInit", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSSkillInit, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSkillLevelup", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.skill.SkillInbornMsgHandler.class))::onCSSkillLevelup, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInformChat", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.inform.InformMsgHandler.class))::onChat, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSignIn", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.activity.ActivityMsgHandler.class))::onCSSignIn, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSStageEnter", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.stage.StageMsgHandler.class))::onCSStageEnter, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSStageSwitch", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.stage.StageMsgHandler.class))::onCSStageSwitch, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSArrangeBag", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBagMsgHandler.class))::onCSArrangeBag, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBagExpand", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBagMsgHandler.class))::onCSBagExpand, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSItemBachSell", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBagMsgHandler.class))::onCSItemBachSell, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSUseItem", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBagMsgHandler.class))::onCSUseItem, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLayerAward", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSLayerAward, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLayerEnd", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSLayerEnd, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLayerEnter", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSLayerEnter, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLayerLeave", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSLayerLeave, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLayerRefreshBuff", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSRefreshBuff, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRefreshTower", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.tower.TowerMsgHandler.class))::onCSRefreshTower, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceEnd", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSBattleEnd, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceAuto", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSInstanceAuto, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBoxAward", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSInstanceBox, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceEnter", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSInstanceEnter, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceLeave", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSInstanceLeave, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceLottery", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.instance.InstanceMsgHandler.class))::onCSInstanceLottery, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBulletinOpenUI", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::bulletinOpenUI, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSAccountRandomName", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSAccountRandomName, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSAccountReconnect", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSAccountReconnect, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCharacterCreate", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSCharacterCreate, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCharacterLogin", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSCharacterLogin, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLogin", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSLogin, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSQueryCharacters", (GofFunction1<org.gof.demo.seam.msg.MsgParamAccount>)(ob.getTargetBean(org.gof.demo.seam.account.AccountMsgHandler.class))::onCSQueryCharacters, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSAcceptFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSAcceptFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSFriendList", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSFriendList, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRecommendFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSRecommendFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRefuseFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSRefuseFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRemoveBlackList", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSRemoveBlackList, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRemoveFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSRemoveFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRequestFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSRequestFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSearchFriend", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSSearchFriend, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSToBlackList", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.friend.FriendMsgHandler.class))::onCSToBlackList, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSStageMove", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.StageBattleMsgHandler.class))::onCSStageMove, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSStageMove2", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.StageBattleMsgHandler.class))::onCSStageMove2, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSStageMoveStop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.battlesrv.msgHandler.StageBattleMsgHandler.class))::onCSStageMoveStop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBuyShop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.ShopMsgHandler.class))::onBuyShop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSBuyShopGoods", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.ShopMsgHandler.class))::onCSBuy, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenShop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.ShopMsgHandler.class))::onCSOpenShop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRequestShopTags", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.ShopMsgHandler.class))::onCSRequestTags, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSRefreshShop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.shop.ShopMsgHandler.class))::onRefreshShop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestInstanceStar", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSInstanceStar, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestAddItem", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestAddItem, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestAddMoney", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestAddMoney, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestGiveAllGeneral", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestGiveAllGeneral, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestGiveGeneral", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestGiveGeneral, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestSendSysMail", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestSendSysMail, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestVIP", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestVIP, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestWhoIsMyDad", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSTestWhoIsMyDad, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInformToAll", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSToAll, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTestUpdateTime", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.test.TestMsgHandler.class))::onCSUpdateTime, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSEquipDown", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSEquipDown, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSEquipReclaim", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSEquipReclaim, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSEquipUp", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSEquipUp, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemComposite", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemComposite, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemCompositeAllTop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemCompositeAllTop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemCompositeTop", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemCompositeTop, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemDown", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemDown, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemDownAll", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemDownAll, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemUp", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemUp, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGemUpAll", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSGemUpAll, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSPartChongxing", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSPartChongxing, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSPartQianghua", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.item.ItemBodyMsgHandler.class))::onCSPartQianghua, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSInstanceRank", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.rank.RankMsgHandler.class))::onCSInstanceRank, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSLevelRank", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.rank.RankMsgHandler.class))::onLevelRank, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCommitQuestDaily", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::commitQuestDaily, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCommitQuestInstDaily", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::commitQuestInstDaily, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCommitQuestNormal", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::commitQuestNormal, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenQuest", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::openQuest, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenQuestDaily", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::openQuestDaily, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSOpenQuestInstDaily", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.quest.QuestMsgHandler.class))::openQuestInstDaily, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSceneEvent", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.scene.SceneMsgHandler.class))::onCSSceneEvent, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSSceneTrigger", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.scene.SceneMsgHandler.class))::onCSSceneTrigger, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGatcha", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.treasure.TreasureMsgHandler.class))::onCSGatcha, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSGatcha10", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.treasure.TreasureMsgHandler.class))::onCSGatcha10, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamReqCloseUI", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::CloseUI, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamReqOpenUI", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::OpenUI, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamApply", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::apply, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamApplyConfirm", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::applyConfirm, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamRepCall", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::call, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamRepCreate", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::create, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamMine", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::getMyTeam, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamInvite", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::invite, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamInviteConfirm", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::inviteConfirm, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamReqJoin", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::join, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamRepKick", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::kick, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamReqLaunch", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::launch, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamLeave", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::leave, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamRepLeaveQueue", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::leaveQueue, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSTeamRepLeave", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.team.TeamRepMsgHandler.class))::leaveReq, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSCheckMailRemoveable", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSCheckMailRemoveable, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSClearMail", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSClearMail, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSMailList", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSMailList, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSPickupAllMail", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSPickupAllMail, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSPickupMail", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSPickupMail, 1);  
		ob.reg("class org.gof.demo.worldsrv.msg.Msg$CSReadMail", (GofFunction1<org.gof.demo.seam.msg.MsgParam>)(ob.getTargetBean(org.gof.demo.worldsrv.mail.MailMsgHandler.class))::onCSReadMail, 1);  
	}
}


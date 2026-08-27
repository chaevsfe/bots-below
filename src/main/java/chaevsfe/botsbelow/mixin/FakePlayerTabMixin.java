package chaevsfe.botsbelow.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

@Mixin(targets = "carpet.patches.EntityPlayerMPFake")
public abstract class FakePlayerTabMixin {

	public int getTabListOrder() {
		return -1000000;
	}

	public Component getTabListDisplayName() {
		ServerPlayer self = (ServerPlayer) (Object) this;
		return Component.literal(self.getGameProfile().name())
				.withStyle(ChatFormatting.GRAY);
	}
}

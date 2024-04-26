/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.mixin.networking;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.packet.UnknownCustomPayload;

@Mixin(UnknownCustomPayload.class)
public class UnknownCustomPayloadMixin {
	@ModifyReturnValue(method = "createCodec", at = @At("RETURN"))
	private static <T extends PacketByteBuf> PacketCodec<T, CustomPayload> createCodec(@Coerce PacketCodec<T, CustomPayload> codec) {
		return new PacketCodec<>() {
			@Override
			public CustomPayload decode(T buf) {
				return codec.decode(buf);
			}

			@Override
			public void encode(T buf, CustomPayload value) {
				throw new RuntimeException("Failed to find encoder for custom payload. Are you sure you registered one using PayloadTypeRegistry for both the client and server?");
			}
		};
	}
}

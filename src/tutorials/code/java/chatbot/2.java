//...
MixerUser user = mixer.use(UsersService.class).getCurrent().get();
MixerChat chat = mixer.use(ChatService.class).findOne(user.channel.id).get();
MixerChatConnectable chatConnectable = chat.connectable(mixer);
//...

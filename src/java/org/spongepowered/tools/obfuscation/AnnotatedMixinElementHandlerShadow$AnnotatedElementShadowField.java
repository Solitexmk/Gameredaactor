/* 1 */ package org.spongepowered.tools.obfuscation;class AnnotatedMixinElementHandlerShadow$AnnotatedElementShadowField extends AnnotatedMixinElementHandlerShadow$AnnotatedElementShadow<VariableElement, MappingField> { public AnnotatedMixinElementHandlerShadow$AnnotatedElementShadowField(VariableElement paramVariableElement, AnnotationHandle paramAnnotationHandle, boolean paramBoolean) { super(paramVariableElement, paramAnnotationHandle, paramBoolean, IMapping.Type.FIELD); }
/*   */   
/*   */   final AnnotatedMixinElementHandlerShadow this$0;
/*   */   public MappingField getMapping(TypeHandle paramTypeHandle, String paramString1, String paramString2) {
/* 5 */     return new MappingField(paramTypeHandle.getName(), paramString1, paramString2);
/*   */   } public void addMapping(ObfuscationType paramObfuscationType, IMapping<?> paramIMapping) {
/* 7 */     AnnotatedMixinElementHandlerShadow.this.addFieldMapping(paramObfuscationType, setObfuscatedName(paramIMapping), getDesc(), paramIMapping.getDesc());
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\tools\obfuscation\AnnotatedMixinElementHandlerShadow$AnnotatedElementShadowField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
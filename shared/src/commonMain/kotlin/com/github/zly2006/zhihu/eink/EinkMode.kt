package com.github.zly2006.zhihu.eink

import androidx.compose.runtime.staticCompositionLocalOf

/**
 * 全局墨水屏模式状态。
 * true: 墨水屏模式 (纯黑白，无动画，强制原生渲染)
 * false: 普通模式
 */
val LocalEinkMode = staticCompositionLocalOf { false }

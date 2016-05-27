#include "taskbar_Taskbar.h"

#include <windows.h>

JNIEXPORT void JNICALL Java_taskbar_Taskbar_setProgressState(JNIEnv *env, jclass clazz, jint hwnd, jint tbpFlags) {
    SetProgressState((int) hwnd, (int) tbpFlags);
}

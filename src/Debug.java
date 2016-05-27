import nativewindowlib.WindowUtils;
import taskbar.Taskbar;

public class Debug {

	public static void main(String[] args) {
		int hwnd = WindowUtils.getVisibleWindows().get(0).getHandle();

		Taskbar.setProgressState(hwnd, Taskbar.TBPF_ERROR);
	}

}

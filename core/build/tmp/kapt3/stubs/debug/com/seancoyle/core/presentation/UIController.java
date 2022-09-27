package com.seancoyle.core.presentation;

import com.seancoyle.core.state.Response;
import com.seancoyle.core.state.StateMessageCallback;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/seancoyle/core/presentation/UIController;", "", "displayProgressBar", "", "isDisplayed", "", "hideSoftKeyboard", "onResponseReceived", "response", "Lcom/seancoyle/core/state/Response;", "stateMessageCallback", "Lcom/seancoyle/core/state/StateMessageCallback;", "core_debug"})
public abstract interface UIController {
    
    public abstract void displayProgressBar(boolean isDisplayed);
    
    public abstract void hideSoftKeyboard();
    
    public abstract void onResponseReceived(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.Response response, @org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateMessageCallback stateMessageCallback);
}
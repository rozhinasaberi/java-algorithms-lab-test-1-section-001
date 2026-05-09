import streamlit as st


def ten_largest(values: list[int]) -> list[int]:
    return sorted(values, reverse=True)[:10]


def is_palindrome(text: str) -> bool:
    return text == text[::-1]


st.set_page_config(page_title="Algorithms Lab Test Tutor 001", page_icon="🧠", layout="wide")

st.title("🧠 Algorithms Lab Test Tutor — Section 001")
st.write(
    "This tutor app packages the lab test ideas into quick interactive exercises for array processing, recursion, and linked-list thinking."
)

tab1, tab2, tab3 = st.tabs(["Top Ten Finder", "Palindrome Check", "Linked List Idea"])

with tab1:
    raw = st.text_input("Enter integers", "5, 12, 3, 19, 25, 7, 30, 1, 50, 9, 11, 8, 60")
    values = [int(x.strip()) for x in raw.split(",") if x.strip()]
    st.write("Top ten values:", ten_largest(values))

with tab2:
    text = st.text_input("Enter text to test", "racecar")
    st.metric("Palindrome?", "Yes" if is_palindrome(text) else "No")
    st.caption("The recursive Java solution compares the left and right ends, then moves inward.")

with tab3:
    st.write("A singly linked list stores each value together with a pointer to the next node.")
    st.code("Head -> Node(value) -> Node(value) -> Node(value) -> null", language="text")

# Ripple AI

**An AI document assistant for small businesses: an Android app (Kotlin) with a Python AI backend.**

Snap a quotation or invoice on your phone. Ripple extracts the data, checks it, lets you correct it, and answers questions across all your documents 

## Tech stack

**Android app**
- Kotlin, Jetpack Compose
- MVVM
- Coroutines + Flow
- Retrofit
- ML Kit
- Firebase Analytics

**AI backend **
- Python, FastAPI
- Azure AI Document Intelligence / Gemini for extraction
- Embeddings and vector search for retrieval
- PostgreSQL
- Azure deployment

---

## Architecture

```
Android app
  UI (Compose) → ViewModel → Repository → API layer
                                              │
                                              ▼
AI backend (FastAPI)
  Extraction → Validation → Storage (PostgreSQL + vectors)
                                              │
                                              ▼
  RAG Q&A with citations · Agent tools · MCP server
```

---

## Evaluation

Results will be published here once the test set is in place: extraction accuracy, citation accuracy, average cost per document, and response time.

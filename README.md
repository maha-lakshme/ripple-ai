# Ripple AI

**An AI document assistant for small businesses: an Android app (Kotlin) with a Python AI backend.**

Snap a quotation or invoice on your phone. Ripple extracts the data, checks it, lets you correct it, and answers questions across all your documents, such as *"Which supplier quoted the lowest for cement?"* or *"Which invoices don't add up?"*

> **Status:** active development. The Android app and AI chat are working; the document-AI backend is being built now. See the roadmap below.

---

## Working today

- AI chat with streaming responses
- Vision AI using ML Kit
- Voice-to-text AI interaction
- Retry and partial-failure handling
- Firebase Analytics logging

## In progress

- [ ] **Document capture:** scan quotations and invoices with the camera, with an on-device ML Kit preview that works offline
- [ ] **Extraction backend:** FastAPI service that turns documents into structured JSON (vendor, date, line items, totals)
- [ ] **Validation:** flags documents where line items don't add up to the total, or required fields are missing
- [ ] **Review screen:** correct extracted fields in the app before saving (human-in-the-loop)
- [ ] **Document Q&A (RAG):** ask questions across all saved documents; every answer cites its source document
- [ ] **Agent tools:** search documents, compare quotes, calculate totals, flag anomalies
- [ ] **MCP server:** exposes the same tools to any MCP-compatible client
- [ ] **Evaluation:** test set of sample documents with known answers, reporting extraction accuracy, citation accuracy, cost per document and latency
- [ ] **Cloud deployment:** backend on Azure with PostgreSQL

---

## Tech stack

**Android app**
- Kotlin, Jetpack Compose
- MVVM, Hilt dependency injection
- Coroutines + Flow
- Retrofit
- ML Kit
- Firebase Analytics

**AI backend (in progress)**
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
